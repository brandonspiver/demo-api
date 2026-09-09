# Basic Networking Notes

## App Port

Command used:

```bash
ss -tulpn | grep 8080
```
Result:

```bash
tcp   LISTEN 0      100                 *:8080            *:*    users:(("java",pid=1525,fd=9))
```

## Local API Test

Command used:

```bash
curl -i -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Learn networking"}'
```

Result:

```bash
HTTP/1.1 201
Content-Type: application/json
Transfer-Encoding: chunked
Date: Thu, 02 Jul 2026 12:31:24 GMT

{"id":2,"title":"Learn networking"}
```

## Windows Test

Command used from PowerShell:

```powershell
curl.exe -i -X POST http://localhost:8080/api/tasks -H "Content-Type: application/json" -d "{\"title\":\"From Windows\"}"
```

Result:

```text
PASTE RESULT HERE
```

## What ping does

`ping` checks whether a host is reachable.

It does not check whether my Spring Boot app is working.

## What curl does

`curl` sends an HTTP request to my app and shows the response.

## What ss -tulpn does

`ss -tulpn` shows which ports are open and which process is listening on them.