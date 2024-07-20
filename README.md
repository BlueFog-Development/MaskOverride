# MaskOverride

**MaskOverride** ist ein JavaFX-Anwendung zum Bearbeiten von Textdateien. Die Anwendung sucht nach Zeilen, die mit einer
bestimmten Maske beginnen, und ersetzt diese Zeilen durch eine neue Formatierung.

## Funktionen

- **Datei auswählen**: Wählen Sie eine Textdatei aus, die bearbeitet werden soll.
- **Startnummer festlegen**: Geben Sie die Startnummer an, mit der die Übereinstimmungen ersetzt werden sollen.
- **Suchmaske festlegen**: Geben Sie die Maske an, nach der in der Datei gesucht wird.
- **Datei bearbeiten**: Verarbeitet die Datei und speichert das Ergebnis in einer neuen Datei.
- **Beenden**: Schließt die Anwendung.

## Installation

1. Stellen Sie sicher, dass [Java JDK 17](https://www.oracle.com/java/technologies/javase-downloads.html) installiert
   ist.
2. Klonen Sie das Repository oder laden Sie den Quellcode herunter.
3. Navigieren Sie im Terminal in das Projektverzeichnis und führen Sie den folgenden Befehl aus, um die Anwendung zu
   starten:

    ```bash
    mvn clean javafx:run
    ```

## Verzeichnisstruktur

- `src/main/java/eu/bluefogdev/maskoverride/MOApplication.java`: Hauptklasse, die die JavaFX-Anwendung startet.
- `src/main/java/eu/bluefogdev/maskoverride/MoController.java`: Controller-Klasse für die Benutzeroberfläche.
- `src/main/resources/fxml/mo-view.fxml`: FXML-Datei, die die Benutzeroberfläche definiert.
- `src/main/resources/fxml/icon.png`: Symbolbild für das Anwendungsfenster.
- `pom.xml`: Maven-Build-Konfigurationsdatei.

## Lizenz

Dieses Projekt ist unter der MIT-Lizenz lizenziert - siehe die [LICENSE](LICENSE) Datei für Details.

## Autoren

- **[Sandro Simperl]** - Initialarbeit - [SandroSimperl](https://github.com/SandroSimperl)
