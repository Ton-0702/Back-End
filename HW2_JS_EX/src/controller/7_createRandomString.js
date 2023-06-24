// /api/random-string/:number
function createRandomString(req,res){
    const length = Number(req.params.number);
    const characters ="AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
    const characterLength = characters.length
    let randomString =  ""
    // console.log(characters[Math.floor(Math.random()* (characterLength - 0 + 1)) + 0]);
    for (let i=1; i<=length; i++){
        randomString += characters[Math.floor(Math.random()* (characterLength - 0 + 1)) + 0]
    }

    res.send(randomString)
}


module.exports = {
    createRandomString,
}