const express = require('express');
const router = express.Router();
const createObjectBookController = require("../controller/11_createObjectBook");

router.get('/create-book', createObjectBookController.createBook)

module.exports = router;