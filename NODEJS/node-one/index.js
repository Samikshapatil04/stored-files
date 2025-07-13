// dated 2/7/25

const http = require("http");
const url = require("url");

const server = http.createServer((req, res) => {
  const x = url.parse(req.url, true);
  const query = x.query;
  let returnString = "";
  if (query?.age) {
    returnString = `Hell0, ${query.age} years old`;
  } 
  if (query?.hairstyle) {
    returnString += ` Hello ${query.hairstyle} hairstyle`;
  }


  // res.setHeader("Access-Control-Allow-Origin", "*");
  // res.setHeader("access-control-allow-methods", "GET, POST, PUT, DELETE");
  res.writeHead(200, { "content-type": "text/plain" });
  console.log("Received request:", req);
  if (req.url == "/samiksha") {
    //routing
    res.end("Helllo, samiksha!" + returnString);
  } else if (req.url == "/alekh!") {
    res.end("Hello, alekh!" + returnString);
  } else {
    res.end("Hello, world!" + returnString);
  }

  // res.writeHead(200, {"content-type": "text/plain"});
  // res.end("Hello World!");
});

server.listen(3000, () => {
  console.log("Server is running at http://localhost:3000/");
});
