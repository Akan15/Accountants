public class Test {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        IncomeTaxType incTaxType = new IncomeTaxType();
        VATaxType vaTaxType = new VATaxType();
        ProgressiveTaxType progTaxType = new ProgressiveTaxType();
        Bill[] payments = new Bill[] {
                new Bill(50000, incTaxType, taxService),
                new Bill(75000, vaTaxType, taxService),
                new Bill(97000, progTaxType, taxService),
                new Bill(115000, progTaxType, taxService)
        };
        
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}