class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String email : emails){
            String formattedEmail = getFormattedEmail(email);
            uniqueEmails.add(formattedEmail);
        }
        return uniqueEmails.size();
    }

    public String getFormattedEmail(String email){
        String[] arr=email.split("@");
        String localName = arr[0];
        String domainName = arr[1];

        String[] arrWithPlus = localName.split("\\+");
        localName = arrWithPlus[0];
        localName = localName.replace(".","");
        return localName+"@"+domainName;
    }
}