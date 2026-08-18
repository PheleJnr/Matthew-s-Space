def get_choice(prompt):
    return int(input(prompt))


def main_menu():
    main_menu_text = """
Welcome to Nokia

Press 1 for Phone book
Press 2 for Messages
Press 3 for chat
Press 4 for Call register
Press 5 for Tones
Press 6 for Settings
Press 7 for Call divert
Press 8 for Games
Press 9 for Calculator
Press 10 for Reminders
Press 11 for Clock
Press 12 for Profiles
Press 13 for SIM services
Press 14 for Exit
"""
    while True:
        print(main_menu_text)
        choice = get_choice("Enter number between 1 to 13 or 14 to Exit: ")

        match choice:
            case 1:
                phonebook_menu()
            case 2:
                messages_menu()
            case 3:
                print("Chat")
            case 4:
                call_register_menu()
            case 5:
                tones_menu()
            case 6:
                settings_menu()
            case 7:
                print("Call divert")
            case 8:
                print("Games")
            case 9:
                print("Calculator")
            case 10:
                print("Reminders")
            case 11:
                clock_menu()
            case 12:
                print("Profiles")
            case 13:
                print("SIM services")
            case 14:
                print("Exit")
                return
            case _:
                print("Invalid choice")


def phonebook_menu():
    print("Phone book")
    phonebook_text = """
Press 1 for Search
Press 2 for Service Nos
Press 3 for Add Name
Press 4 for Erase
Press 5 for Edit
Press 6 for Assign tone
Press 7 for Send b'card
Press 8 for Options
Press 9 for Speed dials
Press 10 for Voice tags
Press 0 for Back to mainMenu
"""
    while True:
        print(phonebook_text)
        choice = get_choice("Enter number between 1 to 10 or 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Search")
            case 2:
                print("Service Nos")
            case 3:
                print("Add Name")
            case 4:
                print("Erase")
            case 5:
                print("Edit")
            case 6:
                print("Assign tone")
            case 7:
                print("Send b'card")
            case 8:
                options_menu()
            case 9:
                print("Speed dials")
            case 10:
                print("Voice tag")
            case _:
                print("Invalid choice")


def options_menu():
    print("options")
    options_menu_text = """
press 1 for Type of view
press 2 for Memory Status
"""
    print(options_menu_text)


def messages_menu():
    print("Messages")
    messages_text = """
press 1 for Write messages
press 2 for Inbox
press 3 for Outbox
press 4 for Picture messages
press 5 for Templates
press 6 for Smileys
press 7 for Message settings
press 8 for Info settings
press 9 for Voice mailbox number
press 10 for Service command editor
Press 0 for Back to MainMenu
"""
    while True:
        print(messages_text)
        choice = get_choice("Enter Number from 1 to 10 or 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Write Message")
            case 2:
                print("Inbox")
            case 3:
                print("Outbox")
            case 4:
                print("Picture messages")
            case 5:
                print("Templates")
            case 6:
                print("Smileys")
            case 7:
                print("Messages settings")
                messages_settings_menu()
            case 8:
                print("Info services")
            case 9:
                print("Voice mailbox number")
            case 10:
                print("Service command editor")
            case _:
                print("Invalid choice")


def messages_settings_menu():
    messages_settings_text = """
press 1 for Set
press 2 for Common
Press 0 for Back to messageMenu
"""
    while True:
        print(messages_settings_text)
        choice = get_choice("Enter Number from 1 to 2 or 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Set")
                set_menu()
            case 2:
                print("Common")
                common_menu()


def set_menu():
    set_text = """
Press 1 for Message centre number
Press 2 for Message sent as
Press 3 for Message validity
Press 0 for Back to messagessettingsMenu
"""
    while True:
        print(set_text)
        choice = get_choice("Enter Number from 1 to 3 or 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Message centre number")
            case 2:
                print("Message sent as")
            case 3:
                print("Message validity")


def common_menu():
    common_text = """
Press 1 for Delivery report
Press 2 for Reply via same centre
Press 3 for Character support
Press 0 for Back to messagessettingsMenu
"""
    while True:
        print(common_text)
        choice = get_choice("Enter Number from 1 to 3 or 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Delivery report")
            case 2:
                print("Reply via same centre")
            case 3:
                print("Character support")


def call_register_menu():
    print("Call register")
    call_register_text = """
Press 1 for Missed calls
Press 2 for Recieved calls
Press 3 for Dialled calls
Press 4 for Erase recent calls
Press 5 for Show call duration
Press 6 for Show call costs
Press 7 for Call cost settings
Press 8 for Prepaid credit
Press 0 for Back to mainMenu
"""
    while True:
        print(call_register_text)
        choice = get_choice("Enter Number from 1 to 8 or Press 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Missed calls")
            case 2:
                print("Recieved calls")
            case 3:
                print("Dialled numbers")
            case 4:
                print("Erase recent call list")
            case 5:
                print("Show call duration")
                show_call_duration_text = """
Press 1 for Last call duration
Press 2 for All calls' duration
Press 3 for Recieved calls' duration
Press 4 for Dialled calls' duration
Press 5 for Clear counters
"""
                print(show_call_duration_text)
            case 6:
                print("Show call costs")
                show_call_costs_text = """
Press 1 for Last call cost
Press 2 for All calls' cost
Press 1 Clear counters
"""
                print(show_call_costs_text)
            case 7:
                print("Call cost settings")
                call_cost_settings_text = """
press 1 for Call cost limit
press 2 for Show cost in
"""
                print(call_cost_settings_text)
            case 8:
                print("Prepaid credit")


def tones_menu():
    print("Tones")
    tones_text = """
Press 1 for Ringing tone
Press 2 for Ringing volume
Press 3 for Incoming call alert
Press 4 for Composer
Press 5 for Messages alert tone
Press 6 for Keypad tones
Press 7 for Warning and games tones
Press 8 for Vibrating alert
Press 9 for Screen saver
Press 0 for Back to mainMenu
"""
    while True:
        print(tones_text)
        choice = get_choice("Enter Number from 1 to 9 or 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Ringing tone")
            case 2:
                print("Ringing Volume")
            case 3:
                print("Incoming call alert")
            case 4:
                print("Composer")
            case 5:
                print("Messages alert tone")
            case 6:
                print("Keypad tones")
            case 7:
                print("Warning and games tones")
            case 8:
                print("Vibrating alert")
            case 9:
                print("Screen saver")


def settings_menu():
    print("Settings")
    settings_text = """
Press 1 for Call settings
Press 2 for Phone settings
Press 3 for Security settings
Press 4 for Restore factory settings
Press 0 for Back to mainMenu
"""
    while True:
        print(settings_text)
        choice = get_choice("Enter Number from 1 to 4 or 0 to go back: ")

        if choice == 0:
            break

        match choice:
            case 1:
                print("Call settings")
                call_settings_text = """
Press 1 for Automatic redial
Press 2 for Speed dialing
Press 3 for Call waiting options
Press 4 for Own number sending
Press 5 for Phone line in use
Press 6 for Automatic answer
"""
                print(call_settings_text)
            case 2:
                print("Phone settings")
                phone_settings_text = """
Press 1 for Language
Press 2 for Cell info display
Press 3 for Welcome note
Press 4 for Network selection
Press 5 for Lights
Press 6 for Confirm SIM service actions
"""
                print(phone_settings_text)
            case 3:
                print("Security settings")
                security_settings_text = """
Press 1 for PIN code request
Press 2 for Call barring service
Press 3 for Fixed dialling
Press 4 for Closed user group
Press 5 for Phone security
Press 6 for Change access codes
"""
                print(security_settings_text)
            case 4:
                print("Restore factory settings")


def clock_menu():
    print("Clock")
    clock_text = """
Press 1 for Alarm clock
Press 2 for Clock settings
Press 3 for Date settings
Press 4 for Stopwatch
press 5 for Countdown timer
Press 6 Auto update of date and time
"""
    print(clock_text)



if __name__ == "__main__":
    main_menu()
