function validateName (req,res,next) {
    const { username, password } = req.body;

    if (!username || username.length > 20) {
        next("Missing or username exceed 20 characters");
    }

    if (!password || password.length > 8) {
        // next("Missing or password exceed 8 characters");
        throw Error("Missing or password error");
    }
    next();
}

function errorHandler(error, req, res, next){
    // console.log(error)
    res.status(400).json( 
        { 
        error: error.message
        } );
}


module.exports = {
    validateName,
    errorHandler,
}