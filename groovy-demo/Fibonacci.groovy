current = 1 
next = 1 
10.times { //Ñ­»·10´Î 
    print current + ' ' 
    newCurrent = next 
    next = next + current 
    current = newCurrent 
} 
println ''