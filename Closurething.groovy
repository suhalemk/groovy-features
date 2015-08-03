/**
 Simple example of a closure that accepts multiple parameters
**/
def work(i, j, cl){
    cl(i, j)
}

def sum = {i, j ->
    println(i + j)
}
work(2,4,sum)

