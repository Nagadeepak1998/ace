const express = require('express');
const { setupTracing } = require('./tracing');

const app = express();
app.enable('tracing');

setupTracing(app);

app.get('/', (req, res) => {
  res.json({ status: 'ok' });
});

const PORT = process.env.PORT || 3000;

if (require.main === module) {
  app.listen(PORT, () => {
    console.log(`Server listening on port ${PORT}`);
  });
}

module.exports = app;
