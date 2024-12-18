# Quotes_App
This app allows users to share the quote with other apps. By leveraging Android's **implicit intents**, this app enables seamless sharing of quotes to compatible apps, such as messaging platforms, email clients, or social media.

## How It Works

**- Sharing Quotes:** By tapping the Share button associated with a quote, the app triggers an implicit intent (Intent.ACTION_SEND) to share the quote. The Android system then displays a chooser, allowing users to select their preferred app for sharing.

**- Receiving Apps:** Any app that supports text sharing (e.g., messaging, email, or social media apps) can handle the shared quote.
