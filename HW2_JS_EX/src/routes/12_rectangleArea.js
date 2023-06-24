const express = require('express');
const router = express.Router();
const rectangleAreaController = require("../controller/12_rectangleArea");

router.post('/rectangle', rectangleAreaController.rectangle)

module.exports = router;