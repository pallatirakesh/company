Company Web service using Spring MVC and Angular JS that supports the following:
-  Create new company 
-  Get a list of all companies 
-  Get details about a company 
-  Able to update a company 
-  Able to add beneficial owner(s) of the company 

you can access the service here https://companytest.herokuapp.com/ which shows the web view 

the web service can be queried using the following curls



curl get all companies

curl "https://companytest.herokuapp.com/user/" -H "Accept-Encoding: gzip, deflate, sdch" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36" -H "Accept: application/json, text/plain, */*" -H "Referer: https://companytest.herokuapp.com/" -H "Cookie: JSESSIONID=bqq3zdb67f1y1l5ndcj593hp2" -H "Connection: keep-alive" --compressed

CURL add company
curl "https://companytest.herokuapp.com/user/" -H "Origin: https://companytest.herokuapp.com" -H "Accept-Encoding: gzip, deflate" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36" -H "Content-Type: application/json;charset=UTF-8" -H "Accept: application/json, text/plain, */*" -H "Referer: https://companytest.herokuapp.com/" -H "Cookie: JSESSIONID=bqq3zdb67f1y1l5ndcj593hp2" -H "Connection: keep-alive" --data-binary "{""id"":null,""username"":"""",""address"":""ta"",""email"":""test@test.com"",""name"":""Rakesh"",""city"":""tc"",""country"":""testcountry"",""phonenumber"":""1111111115"",""owners"":""rakesh sam""}" --compressed

curl edit company

curl "https://companytest.herokuapp.com/user/4" -X PUT -H "Origin: https://companytest.herokuapp.com" -H "Accept-Encoding: gzip, deflate, sdch" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36" -H "Content-Type: application/json;charset=UTF-8" -H "Accept: application/json, text/plain, */*" -H "Referer: https://companytest.herokuapp.com/" -H "Cookie: JSESSIONID=bqq3zdb67f1y1l5ndcj593hp2" -H "Connection: keep-alive" --data-binary "{""id"":4,""name"":""Rakesh"",""address"":""taddress"",""city"":""tcity"",""country"":""testcountry"",""email"":""test@test.com"",""phonenumber"":""1111111115"",""owners"":""rakesh sam""}" --compressed

curl delete company


curl "https://companytest.herokuapp.com/user/4" -X DELETE -H "Origin: https://companytest.herokuapp.com" -H "Accept-Encoding: gzip, deflate, sdch" -H "Accept-Language: en-US,en;q=0.8" -H "User-Agent: Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36" -H "Accept: application/json, text/plain, */*" -H "Referer: https://companytest.herokuapp.com/" -H "Cookie: JSESSIONID=bqq3zdb67f1y1l5ndcj593hp2" -H "Connection: keep-alive" --compressed

