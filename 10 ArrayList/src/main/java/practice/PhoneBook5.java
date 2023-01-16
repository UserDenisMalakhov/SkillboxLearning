package practice;

import java.util.*;

public class PhoneBook5 {
    Map<String, String> map = new HashMap<>();


    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента

        if (isPhoneNumber(phone) && isContactName(name)){
            map.put(phone, name);
        }else {
            System.out.println("Неверно указан номер телефона или имя контакта");
        }
    }

    public boolean isPhoneNumber(String phoneNumber){
        boolean isPhoneNumber;
        String regexPhone = "(^[7]{1})([8,9]{1}[0-9]{9})$";
        if (phoneNumber.matches(regexPhone)){
            isPhoneNumber = true;
        }else {
            isPhoneNumber = false;
        }
        return isPhoneNumber;
    }
    public boolean isContactName(String name){
        boolean isContactName;
        String regexName = "(^[А-Я]{1})([а-я,ё]+)$";
        if (name.matches(regexName)){
            isContactName = true;
        }else {
            isContactName = false;
        }
        return isContactName;
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String result = "";
        if (map.containsKey(phone)){
            result = map.get(phone) + " - " + phone;
        }else {
            result = "";
        }
        return result;
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        List<String> contact = new ArrayList<>();
        String phoneNumbers = "";
        if (map.containsValue(name)){

            for (Map.Entry<String, String> entry : map.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                if (name.equals(value)){
                    phoneNumbers = phoneNumbers + key + ", ";
                }
            }
            int indexDelete = phoneNumbers.lastIndexOf(",");
            phoneNumbers = phoneNumbers.substring(0, indexDelete);
            contact.add(name + " - " + phoneNumbers);
        }else {
            contact = new ArrayList<>();
        }
        return new TreeSet<>(contact);
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        Set<String> allContacts = new TreeSet<>();
        List<String> allPhoneDuplicateName = new ArrayList<>();
        String name = "";
        String phone = "";
        String result = "";

        if (map.size() > 0){
            for (Map.Entry<String, String> entry : map.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                result = getContactByName(value).toString().replaceAll("\\[", "")
                        .replaceAll("\\]", "");
                allContacts.add(result);
            }
        }else {
            allContacts = new TreeSet<>();
        }
        return allContacts;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */

}
