// // let x=10;
// // let y=20;
// // let z = x+y;
// // console.log(z);

// if (7745657567 / 2){
//     console.log("Number is divisible!");
// }
// else{
//     console.log("Number is Not divisible!");
// } 

const http = require('http');

let server = http.createServer((req, res) => {
   
    if (req.url === "/hotel_menu") {
       
        res.write(`
        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Hotel Menu</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    background-color: #f8f8f8;
                    margin: 0;
                    padding: 0;
                }
                .menu-container {
                    max-width: 600px;
                    margin: 50px auto;
                    padding: 20px;
                    background-color: white;
                    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                    border-radius: 8px;
                }
                h1 {
                    text-align: center;
                    color: #333;
                    font-size: 2.5rem;
                }
                .menu-section {
                    margin-top: 30px;
                }
                h2 {
                    color: #444;
                    font-size: 1.8rem;
                    border-bottom: 2px solid #eee;
                    padding-bottom: 10px;
                }
                ul {
                    list-style: none;
                    padding-left: 0;
                }
                li {
                    padding: 10px 0;
                    font-size: 1.2rem;
                    color: #555;
                    border-bottom: 1px solid #ddd;
                }
                li:last-child {
                    border-bottom: none;
                }
            </style>
        </head>
        <body>
            <div class="menu-container">
                <h1>Hotel Menu</h1>

                <div class="menu-section">
                    <h2>Appetizers</h2>
                    <ul>
                        <li>Garlic Bread</li>
                        <li>Tomato Soup</li>
                        <li>Chicken Wings</li>
                    </ul>
                </div>

                <div class="menu-section">
                    <h2>Main Course</h2>
                    <ul>
                        <li>Grilled Chicken with Mashed Potatoes</li>
                        <li>Veg Biryani</li>
                        <li>Paneer Butter Masala with Naan</li>
                    </ul>
                </div>

                <div class="menu-section">
                    <h2>Desserts</h2>
                    <ul>
                        <li>Chocolate Brownie</li>
                        <li>Ice Cream Sundae</li>
                        <li>Gulab Jamun</li>
                    </ul>
                </div>

                <div class="menu-section">
                    <h2>Beverages</h2>
                    <ul>
                        <li>Fresh Lime Soda</li>
                        <li>Iced Tea</li>
                        <li>Cappuccino</li>
                    </ul>
                </div>
            </div>
        </body>
        </html>
    `);
        res.end(); 
    } else {
        res.write("<h1>404 Error: Page Not Found</h1>");
        res.end(); 
    }
     
});

const address = "127.0.0.1";
const port = 51000;

server.listen(port, address, () => {
    console.log("Server is running on http://" + address + ":" + port);
});


