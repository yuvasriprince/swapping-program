package main
import "fmt"
func main() {
    var num1,num2 int
    fmt.Print("enter  your name")
    fmt.Scan(&num1)
    fmt.Print("enter the second name ")
    fmt.Scan(&num2)
    fmt.Println("before the swapping: ",num1)
    fmt.Println("before the swapping: ",num2)
    num1,num2 = num2,num1
    fmt.Println("after the swapping: ",num1)
    fmt.Println("after the swapping: ",num2)
}  