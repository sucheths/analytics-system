**Analytics System**

- backened for tracking the user ui activity.
- frontend will have a async JS which calls the backend API with code, pageId, userAgent, Ip address etc
- Api receives the information and uses apache kafka to stream
- persistence used is cassandra 

