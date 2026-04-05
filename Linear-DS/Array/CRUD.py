# Our "database" is just a list
users = []

# CREATE
def create_user(user_id, name, age):
    users.append({"id": user_id, "name": name, "age": age})
    print("User created!")

# READ
def read_users():
    print("\nAll Users:")
    for user in users:
        print(user)

# UPDATE
def update_user(user_id, new_age):
    for user in users:
        if user["id"] == user_id:
            user["age"] = new_age
            print("User updated!")
            return
    print("User not found!")

# DELETE
def delete_user(user_id):
    for user in users:
        if user["id"] == user_id:
            users.remove(user)
            print("User deleted!")
            return
    print("User not found!")

# -----------------------------
# Demo Run
# -----------------------------
create_user(1, "Alice", 25)
create_user(2, "Bob", 30)

read_users()

update_user(1, 26)
read_users()

delete_user(2)
read_users()
