package main

import "fmt"

func main() {
	s := []int{2, 3, 5, 7, 11, 13}

	s = s[0:1]
	fmt.Println(s)

	s = s[:5]
	fmt.Println(s)

	s = s[1:]
	fmt.Println(s)

	var s1 []int
	fmt.Println(s1, len(s1), cap(s1))

	if s1 == nil {
		fmt.Println("nil!")
	}
}
