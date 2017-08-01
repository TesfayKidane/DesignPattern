For some applications, the main purpose is to create objects that contain information they
need to drive the business. One example is a customer services application used at call centers.
Other than servicing the calling customers, the business needs to get the data during the call –
a ‘request’ object that has all details regarding the conversation. 

During the call, the representative answers questions and records them. At the end of the call,
a request object is created with all necessary state information set before saving it in the
database. Obviously, request object creation is not a one-shot job. You can build it step-by-step
using the Builder Pattern. 

Logical steps to create a request object -
1. When a call is connected, the request id and agent information becomes available.

2. The agent will ask for the caller's phone number to retrieve the caller's information from
the database (or if it is a new customer, agent will create user profile)
3. Agent will get/collect what the caller is requesting during the call (as request content)
4. Agent will answer the questions for the request (as response content)
5. If Agent cannot answer a question, a consultation to supervisor or even a third-party (like
a credit agency) can be done during the call.
6. Agent will set 'isAnswered' and 'needCallback' accordingly and close the call (saving all
information in the database)
Use necessary simulation methods to support your implement