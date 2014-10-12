package pl.droidsonroids.gradle.localization

import org.apache.commons.csv.CSVStrategy

import java.text.Normalizer

/**
 * Plugin configuration extension. See README.md for details
 * @author koral--
 */
class ConfigExtension {
    boolean allowNonTranslatableTranslation = false
    boolean allowEmptyTranslations = false
    boolean escapeApostrophes = true
    boolean escapeQuotes = true
    boolean escapeNewLines = true
    boolean escapeBoundarySpaces = true
    boolean convertTripleDotsToHorizontalEllipsis = true
    boolean escapeSlashes = true
    TagEscapingStrategy tagEscapingStrategy = TagEscapingStrategy.IF_TAGS_ABSENT
    Normalizer.Form normalizationForm = Normalizer.Form.NFC
    String defaultColumnName = 'default'
    File csvFile
    String csvFileURI
    ArrayList<String> ignorableColumns = []
    CSVStrategy csvStrategy
}
