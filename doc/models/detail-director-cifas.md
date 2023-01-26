
# Detail Director CIFAS

## Structure

`DetailDirectorCIFAS`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address` | [`Address`](../../doc/models/address.md) | Optional | - | Address getAddress() | setAddress(Address address) |
| `FraudCategory` | `String` | Optional | Fraud category - 00 = Protective Registration - Recorded at request of the person named; 01 = Providing a false name and a true address; 02 = Providing or using the name and particulars of another person; 03 = Providing or using a genuine name and address, but one or more material falsehoods in personal details followed by a serious misuse of the credit or other facility and/or non-payment; 04 = Providing or using a genuine name and address, but one or more material falsehoods in personal details; 05 = Disposal/selling on of goods obtained on credit and failing to settle the finance agreement; 06 = Opening an account for the purpose of fraud; 07 = Aiding and Abetting - Aiding, abetting or assisting, or conspiring with, another or others to fraudulently procure credit, hire or other facilities, or other product or service; 08 = Insurance Fraud - The making of a claim(s) under one or more insurance policy(ies) with one or more material falsehoods or by presenting a false or forged document | String getFraudCategory() | setFraudCategory(String fraudCategory) |
| `Name` | `String` | Optional | Name | String getName() | setName(String name) |
| `NocRef` | `String` | Optional | Not currently supported | String getNocRef() | setNocRef(String nocRef) |
| `Reference` | `String` | Optional | Reference | String getReference() | setReference(String reference) |
| `Supplier` | [`Supplier`](../../doc/models/supplier.md) | Optional | - | Supplier getSupplier() | setSupplier(Supplier supplier) |

## Example (as JSON)

```json
{
  "Address": null,
  "FraudCategory": null,
  "Name": null,
  "NocRef": null,
  "Reference": null,
  "Supplier": null
}
```

