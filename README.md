# ACE Node Example

This project demonstrates an **Express** application instrumented with **OpenTelemetry** for distributed tracing. The sample app exposes a single endpoint and automatically collects trace data whenever requests are handled.

## Setup

1. Install dependencies:
   ```bash
   npm install
   ```
2. Start the application:
   ```bash
   npm start
   ```
   The server listens on port `3000` by default.

## Disabling Tracing

Tracing is enabled by default. To disable instrumentation at runtime, call:

```javascript
const app = express();
app.disable('tracing');
```

The call must occur before the tracing setup in `index.js`.

## Running Tests

Execute the test suite with:

```bash
npm test
```

The tests use **Jest** and **Supertest** to verify that the root endpoint responds correctly.
