function formatDateTime(dateString, format) {
    // Parse the date string into a Date object
    const date = new Date(dateString);

    // Check if the date is valid
    if (isNaN(date)) {
        throw new Error("Invalid date string");
    }

    // Helper function to pad numbers to two digits
    const pad = (num) => (num < 10 ? '0' + num : num);

    // Extract date components
    const year = date.getFullYear();
    const month = pad(date.getMonth() + 1); // Months are 0-based
    const day = pad(date.getDate());
    const hours = pad(date.getHours());
    const minutes = pad(date.getMinutes());
    const seconds = pad(date.getSeconds());

    // Replace placeholders in the format string
    return format
            .replace(/YYYY/g, year)
        .replace(/MM/g, month)
        .replace(/DD/g, day)
        .replace(/HH/g, hours)
        .replace(/mm/g, minutes)
        .replace(/ss/g, seconds);
}

// Example usage
const dateString = "2023-09-24T14:30:00";
        const format = "YYYY-MM-DD HH:mm:ss";
        console.log(formatDateTime(dateString, format)); // Output: "2023-09-24 14:30:00"
