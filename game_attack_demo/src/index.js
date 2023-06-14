const express = require('express');
const app = express();
const port = 3000;
const attackRouter = require('./routes/attack')
const playersRouter = require('./routes/players')
const monsterRouter = require('./routes/monsters')
app.use(express.json());
app.use(express.urlencoded({extended:true}));

// app.use('/api/', attackRouter);
app.use('/api/', playersRouter);
app.use('/api/', monsterRouter);

app.listen(port, () => {
    console.log(`Server listening on port ${port}`);
})
