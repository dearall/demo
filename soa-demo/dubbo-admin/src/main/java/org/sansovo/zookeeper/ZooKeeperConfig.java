package org.sansovo.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZooKeeperConfig {
	public static void main(String[] args) {
		try {
			CuratorFramework zkClient = CuratorFrameworkFactory.builder().
	                connectString("zookeeper.sansovo.org:2181").
	                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
	        zkClient.start();
	 
	        if (zkClient.checkExists().forPath("/dubbo/config/dubbo/dubbo.properties") == null) {
	            zkClient.create().creatingParentsIfNeeded().forPath("/dubbo/config/dubbo/dubbo.properties");
	        }
	        zkClient.setData().forPath("/dubbo/config/dubbo/dubbo.properties", ("dubbo.registry.address=zookeeper://zookeeper.sansovo.org:2181\n" +
	                "dubbo.metadata-report.address=zookeeper://zookeeper.sansovo.org:2181").getBytes());

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
