const express = require('express');
const router = express.Router();
const attackController = require('../controller/attack')

// Database
// const players = [
//     {name: "Vayne", attack:20, health:3, status: "alive" }
// ]

// const monsters = [
//     {name: "Minion", attack: 1, health: 5, status: "alive" },
//     {name: "Cannon", attack: 2, health: 0, status: "death" },
// ]

// export {
//     players,
//     monsters
// }
// Players
// router.put('/attack', attackController.attackThem);

module.exports = router;
