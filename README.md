Build-a-World: Merchandise Inventory Simulator

📌 Project Description

Goal: Simulate a merchandise inventory world where users can add stock (with multiple sizes), process sales, and review inventory and sales history via a console interface.What to Expect:

-A text-based menu for managing items, sizes, and quantities.

-Seamless “cancel” (type q) at any prompt to return to the main menu.

-Clear feedback on stock levels and successful or failed sales.Unique Aspect: Unlike typical demos, this project tracks multi-size variants for each item, mimicking a real e-commerce backend.

🎮 Features

-Add new or existing items with ID, name, category, base cost, and size–quantity pairs

-Sell items by specifying ID, size, quantity, and price; stock updates automatically

-List Inventory: view all items grouped by size and current quantities

-Sales History: review each sale with details (item, size, quantity, price)

-Cancel Flow: type q at any prompt to abort and return to the main menu

🧱 How the Code Works

-Main Menu (Main.java)

-Presents a switch-based text menu for user actions.

-Reads input via Scanner and delegates to InventoryManager.

-Core Classes

-Item: stores product metadata (ID, name, category, cost).

-SizeVariant: tracks stock for one item-size pair with quantity and changeQuantity().

-Inventory: fixed-size array of SizeVariant entries; methods to add/update and list.

-SaleRecord: logs each sale’s details.

-InventoryManager: arrays of Item and SaleRecord; coordinates inventory and sales operations.

-Data Storage

-Arrays: used for fixed-capacity storage.

-No external libraries: pure Java.

Inheritance

-SaleRecord conceptually extends a Transaction superclass (future-proof for returns or other transaction types).

-UML Class Diagram  (Exported from draw.io and included in the repo.)

▶️ How to Run the Program

1. Navigate to the project folder containing the .java files.

2. Compile all classes:

3. javac *.java

4. Launch the simulator:

5. java Main

-Sample Input:

-To add stock: choose 1, then enter ID, name, category, cost, size, qty.

-To sell: choose 2, then enter ID, size, qty, price.

📈 Development Process

-Sprint Goal (4/21–4/23): Implement core classes (Item, SizeVariant, Inventory, SaleRecord, InventoryManager), menu logic, and basic add/sell flows.

-Challenges: Handling multi-size logic without advanced collections; integrating a cancel flow.

-Future Improvements: Replace fixed arrays with ArrayList for scalability; add 2D map simulation; implement returns and other transaction types via true inheritance.

🧠 Author Info

Maxwell Keller — Completed as part of the Build-a-World AP CSA project. Learned: Applying core OOP concepts in Java (encapsulation, arrays, inheritance), README files, and writing a user-friendly console interface.
UML Design: https://drive.google.com/file/d/1cIhob7LxVD3vIw1F_CJSlQOxZDuI5PML/view?usp=sharing

Thank you for exploring this Merchandise Inventory Simulator!
