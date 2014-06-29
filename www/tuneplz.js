var tuneplz = {
    createEvent: function(title, location, notes, startDate, endDate, successCallback, errorCallback) {
        
         cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'TunePlz', // mapped to our native Java class called "Calendar"
            'ACTION_ADD_TUNE_PLZ', // with this action name
            [{                  // and this array of custom arguments to create our entry
                "title": title,
                "description": notes,
                "eventLocation": location,
                "startTimeMillis": startDate.getTime(),
                "endTimeMillis": endDate.getTime()
            }]
        ); 
 
    }
}
module.exports = tuneplz;
