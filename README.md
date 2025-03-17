# StreamFlow: Music Streaming Subscription Management System
StreamFlow is a comprehensive system designed to manage music streaming service subscriptions. This academic project demonstrates core programming concepts while solving real-world problems related to subscription management for services like JOOX, Spotify, and YouTube Music.

## Features

- 🎵 **Subscription Management**: Track subscriptions for various music streaming services
- 🛒 **Order Processing**: Complete purchase workflow with payment details
- 📊 **Inventory Management**: Track stock levels for different subscription packages
- 📝 **Transaction History**: Logging and reporting of all transactions
- 🛠 **Admin Panel**: Manage inventory and view customer orders
- 🛡 **User Authentication**: Secure login system for admin access
- 💾 **Database Integration**: Persistent storage of transaction and inventory records

## Technology Stack

- Java SE
- Java Swing for GUI
- MySQL for database
- NetBeans IDE
- JDBC for database connectivity

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended) or any Java IDE
- MySQL Database Server

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/streamflow.git
   ```

2. Set up the database:
   - Create a database named "uas_ppbo"
   - Create the necessary tables based on the project's SQL schema

3. Open in NetBeans:
   - File > Open Project
   - Select the cloned repository folder

4. Build and run:
   - Right-click project > Run

## Project Structure

```
StreamFlow/
├── src/
│   └── kodeprogram/
│       ├── Customer.java
│       ├── Admin.java
│       ├── Person.java
│       └── Konek.java
│   └── view/
│       ├── ForCustomer.java
│       ├── ForAdmin.java
│       ├── Login.java
│       └── BarangAdmin.java
├── build/
├── nbproject/
└── test/
```

## Usage

1. **Login**: Access the system using admin credentials (default: Admin/123)
2. **Customer Interface**: Manage subscriptions, view order history, and process payments
3. **Admin Interface**: Manage inventory, view all customer orders, and update stock levels
4. **Reports**: Generate reports on transactions and inventory status

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/new-music-service`)
3. Commit your changes (`git commit -m 'Add new music service support'`)
4. Push to the branch (`git push origin feature/new-music-service`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
