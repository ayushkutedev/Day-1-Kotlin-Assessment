fun main()
{
    var Employee1 = Employee()
    println(Employee1.name)
    println(Employee1.age)
    println(Employee1.gender)

}

class Employee{var name : String = "Khushi"
               var age: Int = 21
               var gender: String = "Female"


    fun work() {
        println("Employee Name: $name")
        println("Employee Age: $age")
        println("Employee Gender: $gender")
    }




}