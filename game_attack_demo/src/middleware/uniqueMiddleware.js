function uniqueName(units){
    return (req, res, next) => {
        const { name } = req.body;
        
        const unit = units.find(it => it.name === name);
        if (unit){
            next("Name already exist");
        }

        next();
    }
}

module.exports = {
    uniqueName
}

