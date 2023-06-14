const { players } = require('../database')

function getAllPlayers(req, res) {
    res.send(
        players
    )
}

function getPlayerName(req, res){
    const namePlayer = req.params.name;
    console.log("namePlayer: ", namePlayer);
    players.forEach((element) => {
        if (element.name === namePlayer){
            res.send(
                element
            )
        };
    });
}

function createPlayer(req, res){
    const {name, attact, health} = req.body;
    
    players.push(
        {
            name,
            attack,
            health,
            status: health > 0 ? 'alive' : 'death'
        }
    );
    res.send(
        players
    )
}

module.exports = {
    getAllPlayers,
    getPlayerName,
    createPlayer,
}