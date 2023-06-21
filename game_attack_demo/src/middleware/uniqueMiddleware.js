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
<<<<<<< HEAD

=======
>>>>>>> e8f89432037816e3a7a2fd8c1ec9bc857c0e6bac
