const { NodeSDK } = require('@opentelemetry/sdk-node');
const { getNodeAutoInstrumentations } = require('@opentelemetry/auto-instrumentations-node');

let sdk;

function setupTracing(app) {
  if (app.get('tracing') === false) {
    return;
  }

  sdk = new NodeSDK({
    instrumentations: [getNodeAutoInstrumentations()],
  });

  sdk.start();
}

module.exports = { setupTracing };
