
# Subsidiaries

## Structure

`Subsidiaries`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TreePosition` | `String` | Optional | Position of the limited company in the corporate tree - 1 = Independent company; 2 = Subsidiary; 3 = Parent; 4 = Intermediate parent; 5 = Top of tree | String getTreePosition() | setTreePosition(String treePosition) |
| `TotalElements` | `Double` | Optional | Total number of elements in the corporate tree | Double getTotalElements() | setTotalElements(Double totalElements) |
| `TotalSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the ultimate parent | Double getTotalSubs() | setTotalSubs(Double totalSubs) |
| `TotalNumImmediateSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the limited company | Double getTotalNumImmediateSubs() | setTotalNumImmediateSubs(Double totalNumImmediateSubs) |
| `TotalNumLiveImmediateSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the limited company that are live | Double getTotalNumLiveImmediateSubs() | setTotalNumLiveImmediateSubs(Double totalNumLiveImmediateSubs) |
| `TotalNumDormantImmediateSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the limited company that are dormant | Double getTotalNumDormantImmediateSubs() | setTotalNumDormantImmediateSubs(Double totalNumDormantImmediateSubs) |
| `TotalNumDissolvedLiquidatedImmediateSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the limited company that are dissolved or liquidated | Double getTotalNumDissolvedLiquidatedImmediateSubs() | setTotalNumDissolvedLiquidatedImmediateSubs(Double totalNumDissolvedLiquidatedImmediateSubs) |
| `TotalNumNestedSubs` | `Double` | Optional | Number of nested subsidiaries in the corporate tree | Double getTotalNumNestedSubs() | setTotalNumNestedSubs(Double totalNumNestedSubs) |
| `TotalNumSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the limited company | Double getTotalNumSubs() | setTotalNumSubs(Double totalNumSubs) |
| `TotalNumUKSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the limited company that are UK based | Double getTotalNumUKSubs() | setTotalNumUKSubs(Double totalNumUKSubs) |
| `TotalNumOverseasSubs` | `Double` | Optional | Number of subsidiaries in the corporate tree below the limited company that are foreign | Double getTotalNumOverseasSubs() | setTotalNumOverseasSubs(Double totalNumOverseasSubs) |
| `UKSubsidiaries` | [`List<UKSubsidiaries>`](../../doc/models/uk-subsidiaries.md) | Optional | - | List<UKSubsidiaries> getUKSubsidiaries() | setUKSubsidiaries(List<UKSubsidiaries> uKSubsidiaries) |
| `ForeignSubsidiaries` | [`List<ForgnSubsidiaries>`](../../doc/models/forgn-subsidiaries.md) | Optional | - | List<ForgnSubsidiaries> getForeignSubsidiaries() | setForeignSubsidiaries(List<ForgnSubsidiaries> foreignSubsidiaries) |

## Example (as JSON)

```json
{
  "TreePosition": null,
  "TotalElements": null,
  "TotalSubs": null,
  "TotalNumImmediateSubs": null,
  "TotalNumLiveImmediateSubs": null,
  "TotalNumDormantImmediateSubs": null,
  "TotalNumDissolvedLiquidatedImmediateSubs": null,
  "TotalNumNestedSubs": null,
  "TotalNumSubs": null,
  "TotalNumUKSubs": null,
  "TotalNumOverseasSubs": null,
  "UKSubsidiaries": null,
  "ForeignSubsidiaries": null
}
```

