package main

import (
	"fmt"
)

func main() {
	// var student1 string = "John" // type is string
	// var student2 = "Jane"        // type is inferred
	// x := 2                       // type is inferred

	// 	fmt.Println(student1)
	// 	fmt.Println(student2)
	// 	fmt.Println(x)

	var (
		a string
		b int
		c bool
	)
	const PI = 3.14

	var x, y, z, u, v, w int = 1, 2, 3, 4, 5, 6

	fmt.Println(PI)
	fmt.Println(u)
	fmt.Println(v)
	fmt.Println(w)
	fmt.Println(x)
	fmt.Println(y)
	fmt.Println(z)

	fmt.Println(a)
	fmt.Println(b)
	fmt.Println(c)

	// Camel Case -> myVariableName
	// MyVariableName -> Pascal Case
	// Snake Case -> my_variable_name

}
