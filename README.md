# Probeaufgabe - Schiffe & Häfen

Ziel dieser Probeaufgabe ist es, ein Gefühl dafür zu bekommen, wie du an neue Aufgabenstellungen herangehst. Du bist frei in der Wahl der Technologien und Frameworks. Wenn du zusätzliche Features einbauen möchtest, kannst du das gerne tun.  
Nach ca. **1 Stunden** soll ein erster Entwurf erstellt sein, den du sowohl fachlich als auch technisch vorstellen kannst.

## Grundlegendes

An dich wird die Bitte herangetragen, ein einfaches Planungssystem für Hafenbesuche von Schiffen zu entwickeln. Ziel ist es, die Ankunft und den Aufenthalt von Schiffen in verschiedenen Häfen verwalten zu können. Der Auftraggeber möchte zunächst ein funktionales System, bei dem der Fokus auf Übersicht und einfacher Bedienung liegt – ein hübsches UI ist willkommen, aber kein Muss.

Im bestehenden Projekt gibt es bereits einige Grundklassen, die du nutzen kannst, aber nicht musst.

Bei allen Entitäten sind die aufgeführten Attribute **Mindestanforderungen**. Du kannst gerne weitere Felder hinzufügen, wenn sie sinnvoll erscheinen.

---

## Schiffsregistrierung

Bevor ein Schiff einem Hafenbesuch zugeordnet werden kann, soll es registriert werden. Wichtige Attribute sind:

- **Name des Schiffs**
- **IMO-Nummer** (eindeutige Schiffserkennungsnummer)
- **Reederei** (optional)
- **Schiffstyp** (z. B. Frachtschiff, Containerschiff, Tanker)

---

## Häfen anlegen

In der Systemverwaltung sollen Häfen mit folgenden Eigenschaften gepflegt werden können:

- **Name des Hafens**
- **Land**
- **Maximale Anzahl gleichzeitiger Liegeplätze**
- **Hafen-ID** (automatisch generiert und angezeigt)

---

## Hafenbesuch planen (Visit-Anlage)

Ein geplanter Hafenbesuch besteht aus der Zuweisung eines Schiffs zu einem Hafen für einen bestimmten Zeitraum. Es sollen folgende Angaben erfasst werden:

- **Schiff** (Auswahl aus registrierten Schiffen)
- **Hafen** (Auswahl aus bestehenden Häfen)
- **Ankunftsdatum/Zeit** (*von*)
- **Abfahrtsdatum/Zeit** (*bis*)
- **Besuchsnummer** (automatisch generiert und angezeigt)

Beim Speichern soll überprüft werden, ob im gewählten Zeitraum noch Kapazitäten im Hafen verfügbar sind. Wenn nicht, soll eine Fehlermeldung ausgegeben werden.