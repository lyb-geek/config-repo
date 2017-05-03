var PORT = 8083;

var http = require('http');
var url=require('url');
var path=require('path');

var server = http.createServer(function (request, response) {
    var pathname = url.parse(request.url).pathname;
    response.writeHead(200, {'Content-Type': 'application/json;charset=utf-8'});
	
	if(pathname === '/'){
	  response.end(JSON.stringify({"index" : "欢迎来到首页"}));
	}else if(pathname === '/health.json'){
	  response.end(JSON.stringify({"status" : "UP"}));
	}else{
	   response.end("404");
	}
});
server.listen(PORT);
console.log("Server runing at port: " + PORT + ".");