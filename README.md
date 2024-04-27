This is Sample Angular Project to Load Textbox, Select and Checkboxes dynamically based on the response recieved from Sprong Boot REST API.

UI URI: http://localhost:4200/
REST URI: http://localhost:8080/generateDom
Sample Request:{"textbox":1,"select":1,"checkbox":1}

Sample REST API Response:
[
    {
        "id":"1",
        "type": "text",
        "value": "Hello world!"
    },
    {
        "id": "2",
        "type": "dropdown",
        "data": ["ICE", "WATER", "GAS"]
    },
    {
        "id": "3",
        "type": "checkbox",
        "data": [{
            "text":"isWater",
            "isChecked" : false
        },{
            "text": "isGas",
            "isChecked" : true
        }]
    }
]

Code Set up:
Angular :
npm install
num run start

Springboot:
mvn clean install
Right click on AAMicroServiceApplication.java -> run as -> Java application  
