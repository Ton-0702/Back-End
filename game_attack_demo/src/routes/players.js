const express = require('express');
const router = express.Router();
const playerController = require('../controller/players')

// Players
router.get('/players', playerController.getAllPlayers);

router.get('/player/:name', playerController.getPlayerName);

router.post('/player', playerController.createPlayer);

// router.delete('/player:name', playerController.deletePlayerName);

module.exports = router;