fun main() {
    val car1 = Car("exent", 3456)
    car1.printInfo()
    val car2 = Car("camre", 2021, "BLACK")
    car2.printInfo()

}

class Car(val name: String, val manufacturingYear: Int) {

    lateinit var Ccolor: String

    constructor(Cname: String, CmanufacturingYear: Int, color: String) : this(
        name = Cname,
        manufacturingYear = CmanufacturingYear
    ) {
        Ccolor = color
    }

    init {
        println("Welcome $name")
    }

    fun accelerate() {

    }

    fun useBreake() {

    }
    fun printInfo(){
        if (!::Ccolor.isInitialized){
        println("car name:$name+ car year :$manufacturingYear")
    }else{
        println("car name:$name+ car year :$manufacturingYear + the color is:$Ccolor")
        }}
}