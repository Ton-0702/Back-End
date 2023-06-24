const express = require('express');
const router = express.Router();
const countCharacterController = require('../controller/6_countCharacter');

router.get('/count-characters', countCharacterController.countCharcters);

module.exports = router;