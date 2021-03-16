val x = 1 + 1
println(x)
val a: Int = 2 + 1
var b = 1 + 1
b = 3
b = 4
println(b * b)
var c: Int = 5 + 9
println({
  val q = 1 + 1
  q + 1
})
(d: Int) => d + 1
val Soma = (g: Int) => g + 1
println(Soma(4))
val add = (x: Int, y: Int) => x + y
println(add(1,2))
val emptyFunction = () => "oi"
println(emptyFunction())
val eight = (y: Int) => 8 + y/y
println(eight(4))
//crazy shit 88
var number = (w: Int, z:Int) => w*z
println(number(5,5))