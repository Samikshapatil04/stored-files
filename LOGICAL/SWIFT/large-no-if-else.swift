import Foundation

print("Enter the First Number: ", terminator: "")
let num1 = Int(readLine()!)!

print("Enter the Second Number: ", terminator: "")
let num2 = Int(readLine()!)!

if num1 > num2 {
    print("\(num1) is Largest")
} else {
    print("\(num2) is Largest")
}
