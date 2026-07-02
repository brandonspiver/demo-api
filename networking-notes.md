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