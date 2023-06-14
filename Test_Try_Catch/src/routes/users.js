const express = require('express');
const validate = require('../middleware/validate')
const router = express.Router()

const users = [];

function errorHandler(error, req, res, next){
    res.status(501).json( { error } );
}

router.post('/', validate.validateName, (req, res, next) =>{
    users.push(req.body)
    res.send("Add user success");
});

router.use(errorHandler) // bắt lỗi tất cả api định nghĩa router này
module.exports = router;