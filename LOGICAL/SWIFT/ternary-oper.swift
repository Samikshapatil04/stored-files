import Foundation
print("Enter a number: ", terminator: "")
if let input = readLine(), let num = Int(input){
    let result = (num % 2 == 0 ) ? "Even" : "Odd"
    print("\(num) is \(result)")
}else{
    print("Invalid Input. Please enter a number.")
}