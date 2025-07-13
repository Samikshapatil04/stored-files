import Foundation

print("Enter a number: ", terminator: "")
if let input1 = readLine(), let num1 = Int(input1) {
    
        if num1 > 0 {
            print("Number is positive: \(num1)")
        } 
        else if num1 < 0{
              print("Number is negative: \(num1)")
        }
         else {
            print("Number is Zero: \(num1)")
        }
     
    }