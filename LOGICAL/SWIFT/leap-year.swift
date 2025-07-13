import Foundation
print("Enter a year: ", terminator: "")
if let input = readLine(),let num = Int(input){
    let result = (num % 4 == 0) ?  "Leap Year" : "Not Leap Year"
    print("\(num) is \(result)")
} else {
    print("Invalid input. Please enter a valid number.")
}