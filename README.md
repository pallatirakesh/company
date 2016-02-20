Company Web service using Spring MVC and Angular JS that supports the following:
-  Create new company 
-  Get a list of all companies 
-  Get details about a company 
-  Able to update a company 
-  Able to add beneficial owner(s) of the company 

you can access the service here http://gla.ddns.net:8080/Company/ which shows the web view 

the web service can be quired using the following curls

he following are the cURL for this application 

curl get all companies

curl "http://gla.ddns.net:8080/Company/user/" -H "Accept-Encoding: gzip, deflate, sdch" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.103 Safari/537.36" -H "Accept: application/json, text/plain, */*" -H "Referer: http://gla.ddns.net:8080/Company/" -H "Cookie: JSESSIONID=59A8D79864FE0177B0C836D75E3EA64E" -H "Connection: keep-alive" --compressed


CURL add company

curl "http://gla.ddns.net:8080/Company/user/" -H "Origin: http://gla.ddns.net:8080" -H "Accept-Encoding: gzip, deflate" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.103 Safari/537.36" -H "Content-Type: application/json;charset=UTF-8" -H "Accept: application/json, text/plain, */*" -H "Referer: http://gla.ddns.net:8080/Company/" -H "Cookie: JSESSIONID=59A8D79864FE0177B0C836D75E3EA64E" -H "Connection: keep-alive" --data-binary "{""id"":null,""username"":"""",""address"":""8"",""email"":""sam@abc.com"",""name"":""Rakesh"",""city"":""33e"",""country"":""www"",""phonenumber"":""1111111115"",""owners"":""rakesh sam""}" --compressed


curl edit company

curl "http://gla.ddns.net:8080/Company/user/4" -X PUT -H "Origin: http://gla.ddns.net:8080" -H "Accept-Encoding: gzip, deflate, sdch" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.103 Safari/537.36" -H "Content-Type: application/json;charset=UTF-8" -H "Accept: application/json, text/plain, */*" -H "Referer: http://gla.ddns.net:8080/Company/" -H "Cookie: JSESSIONID=59A8D79864FE0177B0C836D75E3EA64E" -H "Connection: keep-alive" --data-binary "{""id"":4,""name"":""Sam1"",""address"":""8"",""city"":""33e"",""country"":""www"",""email"":""sam@abc.com"",""phonenumber"":""1111111115"",""owners"":""rakesh sam""}" --compressed

curl delete company

curl "http://gla.ddns.net:8080/Company/user/4" -X DELETE -H "Origin: http://gla.ddns.net:8080" -H "Accept-Encoding: gzip, deflate, sdch" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.103 Safari/537.36" -H "Accept: application/json, text/plain, */*" -H "Referer: http://gla.ddns.net:8080/Company/" -H "Cookie: JSESSIONID=59A8D79864FE0177B0C836D75E3EA64E" -H "Connection: keep-alive" --compressed


 
