/**
 Demonstrates a way to add custom methods to Java Classes
 In this example a new metho 'join' is added to StringBuilder
**/

StringBuilder.metaClass.join{ it, first=false ->
    if(!first) delegate.append(",")
    delegate.append("\"").append(it).append("\"") 
}

StringBuilder sb = new StringBuilder()
sb.join("2",true).join("3").join("ab")
println(sb.toString())
