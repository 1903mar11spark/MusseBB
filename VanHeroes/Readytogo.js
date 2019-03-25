window.onload = function() {
    document.getElementById("animal").addEventListener("click",function(){
        sendAjax("https://www.anapioficeandfire.com/api/characters/583", tabs)
    });
}

// url represents resource being requested
// func represents the callback function to be invoked upon successful completion of request
function sendAjax(url, func) {
    // step 1: obtain xhr (note: IE 5,6 do not have this)
    let xhr = new XMLHttpRequest() || new ActiveXObject("Microsoft.HTTPRequest");
    // step 2: define onreadystatechange function
    xhr.onreadystatechange = function(){
        // readyState of 4 means request is complete
        // status of 200 means OK
        if (this.readyState == 4 && this.status == 200) {
            func(this);
        }
    };
    // step 3: prepare the request with open()
    xhr.open("GET", url, true);
    // step 4: send the request
    xhr.send();
}

function tabs(xhr) {
    let apiCall = JSON.parse(xhr.responseText);
    let parag = document.getElementById("para");
    console.log(apiCall);
    for(i=0; i<apiCall.aliases.length; i++){
        
        
        console.log(apiCall.aliases[i]);
        list = document.createElement("LI");
        parag.appendChild(list);
        list.innerText = apiCall.aliases[i];
    }
   


    // document.getElementById("temperature").innerText = "Current Temperature: "+weatherObj.main.temp;
    // document.getElementById("humidity").innerText = "Current Humidity: "+weatherObj.main.humidity;
    // document.getElementById("description").innerText = weatherObj.weather[0].description;
}