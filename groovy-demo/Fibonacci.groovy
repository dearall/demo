current = 1 
next = 1 
10.times { //ѭ��10�� 
    print current + ' ' 
    newCurrent = next 
    next = next + current 
    current = newCurrent 
} 
println ''